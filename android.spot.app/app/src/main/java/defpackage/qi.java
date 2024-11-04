package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qi {
    public static void c(ayj ayjVar) {
        qg.g(ayjVar, 2).ab();
    }

    public static void d(ayj ayjVar) {
        qg.f(ayjVar).J();
    }

    public static int e(azc azcVar, avc avcVar) {
        int a;
        azc H = azcVar.H();
        if (H == null) {
            ll.g(a.af(azcVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (azcVar.G().c().containsKey(avcVar)) {
            Integer num = (Integer) azcVar.G().c().get(avcVar);
            if (num == null) {
                return Integer.MIN_VALUE;
            }
            return num.intValue();
        }
        int D = H.D(avcVar);
        if (D == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        H.i = true;
        azcVar.j = true;
        azcVar.J();
        H.i = false;
        azcVar.j = false;
        if (avcVar instanceof avp) {
            a = blk.b(H.E());
        } else {
            a = blk.a(H.E());
        }
        return D + a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [moh, java.lang.Object] */
    public static va f(atk atkVar, Object obj) {
        va vaVar = (va) atkVar.b.a(obj);
        vaVar.d();
        return vaVar;
    }

    public void b() {
    }

    public void g(kvw kvwVar) {
    }

    public void a(int i, CharSequence charSequence) {
    }
}
