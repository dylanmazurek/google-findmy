package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iw extends brj {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ jb d;

    public iw(jb jbVar, int i, int i2, WeakReference weakReference) {
        this.d = jbVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.brj
    public final void b(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            if ((this.b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = ja.a(typeface, i, z);
        }
        jb jbVar = this.d;
        WeakReference weakReference = this.c;
        if (jbVar.c) {
            jbVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new oa(textView, typeface, jbVar.a, 1));
                } else {
                    textView.setTypeface(typeface, jbVar.a);
                }
            }
        }
    }

    @Override // defpackage.brj
    public final void a(int i) {
    }
}
