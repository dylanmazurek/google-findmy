package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amy {
    public static final amz a() {
        return (amz) anm.b.a();
    }

    public static final boolean b() {
        if (anm.b.a() != null) {
            return true;
        }
        return false;
    }

    public static final amz c(amz amzVar) {
        if (amzVar instanceof aoh) {
            aoh aohVar = (aoh) amzVar;
            if (aohVar.m == alq.a()) {
                aohVar.k = null;
                return amzVar;
            }
        }
        if (amzVar instanceof aoi) {
            aoi aoiVar = (aoi) amzVar;
            if (aoiVar.b == alq.a()) {
                aoiVar.a = null;
                return amzVar;
            }
        }
        amz a = anm.a(amzVar, null, false);
        a.w();
        return a;
    }

    public static final void d() {
        anm.b().e();
    }

    public static final Object e(moh mohVar, mnw mnwVar) {
        amz aohVar;
        moh p;
        if (mohVar != null) {
            amz amzVar = (amz) anm.b.a();
            ams amsVar = null;
            if (amzVar instanceof aoh) {
                aoh aohVar2 = (aoh) amzVar;
                if (aohVar2.m == alq.a()) {
                    moh mohVar2 = aohVar2.k;
                    moh mohVar3 = aohVar2.l;
                    try {
                        p = anm.p(mohVar, mohVar2, true);
                        aohVar2.k = p;
                        aohVar2.l = anm.q(null, mohVar3);
                        return mnwVar.a();
                    } finally {
                        aohVar2.k = mohVar2;
                        aohVar2.l = mohVar3;
                    }
                }
            }
            if (amzVar != null && !(amzVar instanceof ams)) {
                aohVar = amzVar.b(mohVar);
            } else {
                if (amzVar instanceof ams) {
                    amsVar = (ams) amzVar;
                }
                aohVar = new aoh(amsVar, mohVar, null, true, false);
            }
            try {
                amz w = aohVar.w();
                try {
                    return mnwVar.a();
                } finally {
                    amz.E(w);
                }
            } finally {
                aohVar.d();
            }
        }
        return mnwVar.a();
    }

    public static final amv f(final mol molVar) {
        anm.m(anm.a);
        synchronized (anm.c) {
            anm.g = mkm.ad(anm.g, molVar);
        }
        return new amv() { // from class: amx
            @Override // defpackage.amv
            public final void a() {
                mol molVar2 = mol.this;
                synchronized (anm.c) {
                    List list = anm.g;
                    list.getClass();
                    ArrayList arrayList = new ArrayList(mkm.ap(list));
                    boolean z = false;
                    for (Object obj : list) {
                        boolean z2 = true;
                        if (!z && amr.i(obj, molVar2)) {
                            z = true;
                            z2 = false;
                        }
                        if (z2) {
                            arrayList.add(obj);
                        }
                    }
                    anm.g = arrayList;
                }
            }
        };
    }

    public static final void g(amz amzVar, amz amzVar2, moh mohVar) {
        if (amzVar == amzVar2) {
            if (amzVar instanceof aoh) {
                ((aoh) amzVar).k = mohVar;
                return;
            } else if (amzVar instanceof aoi) {
                ((aoi) amzVar).a = mohVar;
                return;
            } else {
                Objects.toString(amzVar);
                throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(amzVar)));
            }
        }
        amz.E(amzVar);
        amzVar2.d();
    }

    public static final void h() {
        boolean z;
        synchronized (anm.c) {
            sy syVar = ((amq) anm.i.get()).f;
            z = false;
            if (syVar != null) {
                if (syVar.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            anm.r();
        }
    }

    public static final ams i(moh mohVar, moh mohVar2) {
        ams amsVar;
        ams a;
        amz b = anm.b();
        if (b instanceof ams) {
            amsVar = (ams) b;
        } else {
            amsVar = null;
        }
        if (amsVar != null && (a = amsVar.a(mohVar, mohVar2)) != null) {
            return a;
        }
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
    }

    public static final amz j(moh mohVar) {
        return anm.b().b(mohVar);
    }
}
