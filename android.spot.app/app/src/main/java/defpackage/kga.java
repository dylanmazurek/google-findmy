package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kga {
    public static final kga a = (kga) kgs.a(new kcb(8));
    public final AtomicReference b = new AtomicReference(new ktn(new ktn(), (byte[]) null));

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void a(kgf kgfVar) {
        ktn ktnVar = new ktn((ktn) this.b.get());
        kgq kgqVar = new kgq((Class) kgfVar.b, (Class) kgfVar.c);
        if (ktnVar.d.containsKey(kgqVar)) {
            kgf kgfVar2 = (kgf) ktnVar.d.get(kgqVar);
            if (!kgfVar2.equals(kgfVar) || !kgfVar.equals(kgfVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(kgqVar.toString()));
            }
        } else {
            ktnVar.d.put(kgqVar, kgfVar);
        }
        this.b.set(new ktn(ktnVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void b(kgf kgfVar) {
        ktn ktnVar = new ktn((ktn) this.b.get());
        kgp kgpVar = new kgp((Class) kgfVar.c, (knb) kgfVar.b);
        if (ktnVar.c.containsKey(kgpVar)) {
            kgf kgfVar2 = (kgf) ktnVar.c.get(kgpVar);
            if (!kgfVar2.equals(kgfVar) || !kgfVar.equals(kgfVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(kgpVar.toString()));
            }
        } else {
            ktnVar.c.put(kgpVar, kgfVar);
        }
        this.b.set(new ktn(ktnVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void c(kgf kgfVar) {
        ktn ktnVar = new ktn((ktn) this.b.get());
        kgp kgpVar = new kgp((Class) kgfVar.c, (knb) kgfVar.b);
        if (ktnVar.a.containsKey(kgpVar)) {
            kgf kgfVar2 = (kgf) ktnVar.a.get(kgpVar);
            if (!kgfVar2.equals(kgfVar) || !kgfVar.equals(kgfVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(kgpVar.toString()));
            }
        } else {
            ktnVar.a.put(kgpVar, kgfVar);
        }
        this.b.set(new ktn(ktnVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void d(kuv kuvVar) {
        ktn ktnVar = new ktn((ktn) this.b.get());
        kgq kgqVar = new kgq((Class) kuvVar.a, (Class) kuvVar.b);
        if (ktnVar.b.containsKey(kgqVar)) {
            kuv kuvVar2 = (kuv) ktnVar.b.get(kgqVar);
            if (!kuvVar2.equals(kuvVar) || !kuvVar.equals(kuvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(kgqVar.toString()));
            }
        } else {
            ktnVar.b.put(kgqVar, kuvVar);
        }
        this.b.set(new ktn(ktnVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kfn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public final ivc e(kgo kgoVar) {
        ktn ktnVar = (ktn) this.b.get();
        kgp kgpVar = new kgp(kgoVar.getClass(), ((kgk) kgoVar).b);
        if (ktnVar.a.containsKey(kgpVar)) {
            return ((kgf) ktnVar.a.get(kgpVar)).a.a(kgoVar);
        }
        throw new GeneralSecurityException(der.c(kgpVar, "No Key Parser for requested key type ", " available"));
    }
}
