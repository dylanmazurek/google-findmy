package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfz {
    public static final kfz a = new kfz();
    public final AtomicReference b = new AtomicReference(new kuv(new kuv((byte[]) null), (byte[]) null));

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    public final synchronized void a(kgf kgfVar) {
        kuv kuvVar = new kuv((kuv) this.b.get());
        if (kgfVar != null) {
            kgg kggVar = new kgg((Class) kgfVar.b, (Class) kgfVar.c);
            if (kuvVar.a.containsKey(kggVar)) {
                kgf kgfVar2 = (kgf) kuvVar.a.get(kggVar);
                if (!kgfVar2.equals(kgfVar) || !kgfVar.equals(kgfVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(kggVar.toString()));
                }
            } else {
                kuvVar.a.put(kggVar, kgfVar);
            }
            this.b.set(new kuv(kuvVar, (byte[]) null));
        } else {
            throw new NullPointerException("primitive constructor must be non-null");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    public final synchronized void b(kgj kgjVar) {
        kuv kuvVar = new kuv((kuv) this.b.get());
        ?? r0 = kuvVar.b;
        Class b = kgjVar.b();
        if (r0.containsKey(b)) {
            kgj kgjVar2 = (kgj) kuvVar.b.get(b);
            if (!kgjVar2.equals(kgjVar) || !kgjVar.equals(kgjVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(b.toString()));
            }
        } else {
            kuvVar.b.put(b, kgjVar);
        }
        this.b.set(new kuv(kuvVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [kge, java.lang.Object] */
    public final Object c(ivc ivcVar, Class cls) {
        kuv kuvVar = (kuv) this.b.get();
        kgg kggVar = new kgg(ivcVar.getClass(), cls);
        if (kuvVar.b.containsKey(kggVar)) {
            return ((kgf) kuvVar.b.get(kggVar)).a.a(ivcVar);
        }
        throw new GeneralSecurityException(der.c(kggVar, "No PrimitiveConstructor for ", " available"));
    }
}
