package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class I0 extends G0 {
    private ArrayList d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.C0, j$.util.stream.F0
    public final void h() {
        List list = this.d;
        boolean z = list instanceof j$.util.List;
        Comparator comparator = this.b;
        if (z) {
            ((j$.util.List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
        long size = this.d.size();
        F0 f0 = this.a;
        f0.i(size);
        if (!this.c) {
            Collection.EL.forEach(this.d, new C0078h(2, f0));
        } else {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (f0.n()) {
                    break;
                } else {
                    f0.accept((F0) next);
                }
            }
        }
        f0.h();
        this.d = null;
    }

    @Override // j$.util.stream.C0, j$.util.stream.F0
    public final void i(long j) {
        ArrayList arrayList;
        if (j < 2147483639) {
            if (j >= 0) {
                arrayList = new ArrayList((int) j);
            } else {
                arrayList = new ArrayList();
            }
            this.d = arrayList;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
