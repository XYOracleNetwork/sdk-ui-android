package network.xyo.ui.helpers.overscroll.adapters

import android.view.View

/**
 * @author amitd
 *
 * @see HorizontalOverScrollBounceEffectDecorator
 */
interface IOverScrollDecoratorAdapter {

    val view: View

    /**
     * Is view in it's absolute start position - such that a negative over-scroll can potentially
     * be initiated. For example, in list-views, this is synonymous with the first item being
     * fully visible.
     *
     * @return Whether in absolute start position.
     */
    val isInAbsoluteStart: Boolean

    /**
     * Is view in it's absolute end position - such that an over-scroll can potentially
     * be initiated. For example, in list-views, this is synonymous with the last item being
     * fully visible.
     *
     * @return Whether in absolute end position.
     */
    val isInAbsoluteEnd: Boolean
}
