package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gce {
    public final List c;
    public final SparseIntArray d;
    public final boolean g;
    private final int h;
    public final juw a = gax.a();
    public final List b = new ArrayList();
    public final List e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public gce(int i, int i2, boolean z) {
        this.h = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.Set, java.lang.Object] */
    public final gbs a(gbo gboVar, int i) {
        gboVar.a = this.h;
        if (i == -1) {
            i = -1;
        }
        List list = this.c;
        ljj ljjVar = gboVar.c;
        int size = list.size();
        int d = gboVar.d();
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        gbs gbsVar = (gbs) ljjVar.b;
        gbs gbsVar2 = gbs.h;
        gbsVar.d = d - 1;
        gbsVar.a |= 2;
        juw juwVar = this.a;
        juv juvVar = ((gbs) gboVar.c.b).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        ljh ljhVar = (ljh) juvVar.z(5);
        ljhVar.w(juvVar);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        ljn ljnVar = ljhVar.b;
        juv juvVar2 = (juv) ljnVar;
        juwVar.getClass();
        juvVar2.d = juwVar;
        juvVar2.a |= 2048;
        if (!ljnVar.y()) {
            ljhVar.t();
        }
        juv juvVar3 = (juv) ljhVar.b;
        juvVar3.a |= 1;
        juvVar3.b = size;
        juv juvVar4 = (juv) ljhVar.q();
        ljj ljjVar2 = gboVar.c;
        if (!ljjVar2.b.y()) {
            ljjVar2.t();
        }
        gbs gbsVar3 = (gbs) ljjVar2.b;
        juvVar4.getClass();
        gbsVar3.c = juvVar4;
        gbsVar3.a |= 1;
        ddg ddgVar = gboVar.f;
        if (!ddgVar.a.isEmpty()) {
            for (njz njzVar : ddgVar.a) {
            }
        }
        gbs a = gboVar.a();
        this.c.add(a);
        this.d.append(size, i);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(gco gcoVar) {
        boolean z = true;
        if (gcoVar.b == 1) {
            if (this.d.valueAt(gcoVar.c()) != -1) {
                z = false;
            }
            hwx.J(z);
        }
        this.b.add(gcoVar);
    }
}
