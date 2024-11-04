package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bau {
    public Object a;
    public final /* synthetic */ ViewGroup b;

    public bau(ro roVar) {
        this.b = roVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [auj, java.lang.Object] */
    public final void a(auj aujVar) {
        if (aujVar == null) {
            int i = auj.b;
            aujVar = aui.a;
        }
        this.a = aujVar;
        if (Build.VERSION.SDK_INT >= 24) {
            bbn.a.a(this.b, this.a);
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        ((ro) this.b).d.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(i + ((ro) this.b).c.left, i2 + ((ro) this.b).c.top, i3 + ((ro) this.b).c.right, i4 + ((ro) this.b).c.bottom);
    }

    public final boolean c() {
        return ((ro) this.b).b;
    }

    public final boolean d() {
        return ((ro) this.b).a;
    }

    public bau(baw bawVar) {
        this.b = bawVar;
        int i = auj.b;
        this.a = aui.a;
    }
}
