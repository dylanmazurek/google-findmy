package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.apps.adm.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hl extends AppCompatImageView implements hp {
    final /* synthetic */ ho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(ho hoVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = hoVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        in.b(this, getContentDescription());
        setOnTouchListener(new hk(this, this));
    }

    @Override // defpackage.hp
    public final boolean c() {
        return false;
    }

    @Override // defpackage.hp
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.o();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            bsc.e(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
