package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ezt extends LinearLayout implements Checkable {
    private static final int[] a = {R.attr.state_checked};
    private boolean b;

    public ezt(Context context) {
        super(context);
        this.b = false;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (z != this.b) {
            this.b = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.b);
    }

    public ezt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
    }

    public ezt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
    }
}
