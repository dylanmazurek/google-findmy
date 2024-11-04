package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irf extends ViewOutlineProvider {
    final /* synthetic */ ShapeableImageView a;
    private final Rect b = new Rect();

    public irf(ShapeableImageView shapeableImageView) {
        this.a = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.a;
        if (shapeableImageView.c == null) {
            return;
        }
        if (shapeableImageView.b == null) {
            shapeableImageView.b = new ivf(shapeableImageView.c);
        }
        ShapeableImageView shapeableImageView2 = this.a;
        shapeableImageView2.a.round(this.b);
        ShapeableImageView shapeableImageView3 = this.a;
        shapeableImageView3.b.setBounds(this.b);
        this.a.b.getOutline(outline);
    }
}
