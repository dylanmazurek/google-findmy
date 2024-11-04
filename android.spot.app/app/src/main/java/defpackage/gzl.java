package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzl implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ nhc c;

    public gzl(nhc nhcVar, Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
        this.c = nhcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        ijs.c();
        nhc nhcVar = this.c;
        ImageView imageView = (ImageView) ((WeakReference) nhcVar.b).get();
        if (!nhcVar.a && imageView != null) {
            imageView.setImageDrawable(this.a);
        }
        if (this.b) {
            this.c.h();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
