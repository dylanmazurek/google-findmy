package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czi implements czj, czg {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final dci e;

    public czi(dci dciVar) {
        this.e = dciVar;
    }

    private final void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            czj czjVar = (czj) this.d.get(size);
            if (czjVar instanceof cza) {
                cza czaVar = (cza) czjVar;
                List j = czaVar.j();
                int size2 = j.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path i = ((czj) j.get(size2)).i();
                        i.transform(czaVar.h());
                        this.b.addPath(i);
                    }
                }
            } else {
                this.b.addPath(czjVar.i());
            }
        }
        czj czjVar2 = (czj) this.d.get(0);
        if (czjVar2 instanceof cza) {
            cza czaVar2 = (cza) czjVar2;
            List j2 = czaVar2.j();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                Path i3 = ((czj) j2.get(i2)).i();
                i3.transform(czaVar2.h());
                this.a.addPath(i3);
            }
        } else {
            this.a.set(czjVar2.i());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((czj) this.d.get(i)).f(list, list2);
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        throw null;
    }

    @Override // defpackage.czg
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            cyz cyzVar = (cyz) listIterator.previous();
            if (cyzVar instanceof czj) {
                this.d.add((czj) cyzVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.czj
    public final Path i() {
        this.c.reset();
        dci dciVar = this.e;
        if (!dciVar.a) {
            int i = dciVar.b;
            if (i != 0) {
                int i2 = i - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    a(Path.Op.XOR);
                                }
                            } else {
                                a(Path.Op.INTERSECT);
                            }
                        } else {
                            a(Path.Op.REVERSE_DIFFERENCE);
                        }
                    } else {
                        a(Path.Op.UNION);
                    }
                } else {
                    for (int i3 = 0; i3 < this.d.size(); i3++) {
                        this.c.addPath(((czj) this.d.get(i3)).i());
                    }
                }
            } else {
                throw null;
            }
        }
        return this.c;
    }
}
