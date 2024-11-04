package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cb {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;

    public cb(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final cb c(ViewGroup viewGroup, be beVar) {
        viewGroup.getClass();
        a ap = beVar.ap();
        ap.getClass();
        return a.ab(viewGroup, ap);
    }

    public final ca a(ag agVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ca caVar = (ca) obj;
                if (amr.i(caVar.a, agVar) && !caVar.b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ca) obj;
    }

    public final ca b(ag agVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ca caVar = (ca) obj;
                if (amr.i(caVar.a, agVar) && !caVar.b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ca) obj;
    }

    public final void d(ca caVar) {
        caVar.getClass();
        if (caVar.f) {
            int i = caVar.h;
            ag agVar = caVar.a;
            a.X(i, agVar.K(), this.a);
            caVar.i();
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mkm.an(arrayList, ((ca) it.next()).g);
        }
        List ag = mkm.ag(mkm.aj(arrayList));
        int size = ag.size();
        for (int i = 0; i < size; i++) {
            ((by) ag.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((ca) list.get(i2));
        }
        List ag2 = mkm.ag(list);
        int size3 = ag2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ca caVar = (ca) ag2.get(i3);
            if (caVar.g.isEmpty()) {
                caVar.a();
            }
        }
    }

    public final void f() {
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            h();
            g(this.b);
            for (ca caVar : new ArrayList(this.c)) {
                if (be.Z(2)) {
                    if (!isAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.a);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(caVar);
                }
                caVar.e(this.a);
            }
            for (ca caVar2 : new ArrayList(this.b)) {
                if (be.Z(2)) {
                    if (!isAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.a);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(caVar2);
                }
                caVar2.e(this.a);
            }
        }
    }

    public final void g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ca) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mkm.an(arrayList, ((ca) it.next()).g);
        }
        List ag = mkm.ag(mkm.aj(arrayList));
        int size2 = ag.size();
        for (int i2 = 0; i2 < size2; i2++) {
            by byVar = (by) ag.get(i2);
            ViewGroup viewGroup = this.a;
            if (!byVar.b) {
                byVar.c(viewGroup);
            }
            byVar.b = true;
        }
    }

    public final void h() {
        for (ca caVar : this.b) {
            if (caVar.i == 2) {
                caVar.h(a.Y(caVar.a.K().getVisibility()), 1);
            }
        }
    }

    public final void i(int i, int i2, fil filVar) {
        synchronized (this.b) {
            Object obj = filVar.c;
            obj.getClass();
            ca a = a((ag) obj);
            if (a == null) {
                Object obj2 = filVar.c;
                if (((ag) obj2).t) {
                    obj2.getClass();
                    a = b((ag) obj2);
                } else {
                    a = null;
                }
            }
            if (a != null) {
                a.h(i, i2);
                return;
            }
            bz bzVar = new bz(i, i2, filVar);
            this.b.add(bzVar);
            bzVar.c(new bx(this, bzVar, 0));
            bzVar.c(new bx(this, bzVar, 2));
        }
    }
}
