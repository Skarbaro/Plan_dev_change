/* eslint-disable-next-line @typescript-eslint/no-explicit-any */
type Listener<T = any> = (data?: T) => unknown

export default abstract class RinzlerEventEmitter {
	#listeners: Map<string, Listener[]> = new Map()
	#onceListeners: Map<string, Listener[]> = new Map()

	on<T>(event: string, func: Listener<T>): void {
		this.#listeners.get(event)?.push(func) || this.#listeners.set(event, [func])
	}

	once<T>(event: string, func: Listener<T>): void {
		this.#onceListeners.get(event)?.push(func) || this.#onceListeners.set(event, [func])
	}

	waitFor<T = undefined>(event: string): Promise<T> {
		return new Promise(resolve => {
			this.once<T>(event, (e: unknown) => {
				resolve(e as T)
			})
		})
	}

	protected async _triggerEvent<T>(event: string, data?: T): Promise<void> {
		this.#listeners.get(event)?.forEach(listener => {
			listener(data)
		})
		if (this.#onceListeners.has(event)) {
			const listeners = this.#onceListeners.get(event)
			this.#onceListeners.set(event, [])
			listeners?.map(listener => {
				listener(data)
			})
		}
	}
	export function useGroupHeader (props: DataTableSetupProps): {
  rowsRef: ComputedRef<RowItem[][]>
  colsRef: ComputedRef<ColItem[]>
  hasEllipsisRef: ComputedRef<boolean>
  dataRelatedColsRef: ComputedRef<
  Array<TableSelectionColumn | TableBaseColumn | TableExpandColumn>
  >
} {
  const rowsAndCols = computed(() => getRowsAndCols(props.columns))
  return {
    rowsRef: computed(() => rowsAndCols.value.rows),
    colsRef: computed(() => rowsAndCols.value.cols),
    hasEllipsisRef: computed(() => rowsAndCols.value.hasEllipsis),
    dataRelatedColsRef: computed(() => rowsAndCols.value.dataRelatedCols)
  }
}
}