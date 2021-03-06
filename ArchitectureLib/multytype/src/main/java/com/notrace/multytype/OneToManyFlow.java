package com.notrace.multytype;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

/**
 * Process and flow operators for one-to-many.
 *
 * @author drakeet
 */
public interface OneToManyFlow<T> {

    /**
     * Sets some item view binders to the item type.
     *
     * @param binders the item view binders
     * @return end flow operator
     */
    @CheckResult
    @SuppressWarnings("unchecked")
    @NonNull
    OneToManyEndpoint<T> to(@NonNull ItemViewBinder<T>... binders);
}
