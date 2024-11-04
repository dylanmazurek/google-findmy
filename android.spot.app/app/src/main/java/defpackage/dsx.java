package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsx implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public dsx(ksr ksrVar, int i) {
        this.b = i;
        this.a = new WeakReference(ksrVar);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Collection, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.b != 0) {
            ksr ksrVar = (ksr) this.a.get();
            if (ksrVar != null && !ksrVar.b.isEmpty()) {
                int j = ksrVar.j();
                int i2 = ksrVar.i();
                if (ksr.l(j, i2)) {
                    ArrayList arrayList = new ArrayList((Collection) ksrVar.b);
                    int size = arrayList.size();
                    while (i < size) {
                        ((dso) arrayList.get(i)).e(j, i2);
                        i++;
                    }
                    ksrVar.k();
                }
            }
            return true;
        }
        fql fqlVar = (fql) this.a.get();
        if (fqlVar != null && !fqlVar.a.isEmpty()) {
            int e = fqlVar.e();
            int d = fqlVar.d();
            if (fql.g(e, d)) {
                ArrayList arrayList2 = new ArrayList(fqlVar.a);
                int size2 = arrayList2.size();
                while (i < size2) {
                    ((dso) arrayList2.get(i)).e(e, d);
                    i++;
                }
                fqlVar.f();
            }
        }
        return true;
    }

    public dsx(fql fqlVar, int i) {
        this.b = i;
        this.a = new WeakReference(fqlVar);
    }
}
