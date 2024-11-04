package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class div implements dir {
    private final rx b = new dte();

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            rx rxVar = this.b;
            if (i < rxVar.d) {
                diu diuVar = (diu) rxVar.c(i);
                rx rxVar2 = this.b;
                dit ditVar = diuVar.c;
                Object f = rxVar2.f(i);
                if (diuVar.e == null) {
                    diuVar.e = diuVar.d.getBytes(dir.a);
                }
                ditVar.a(diuVar.e, f, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object b(diu diuVar) {
        if (this.b.containsKey(diuVar)) {
            return this.b.get(diuVar);
        }
        return diuVar.b;
    }

    public final void c(div divVar) {
        this.b.h(divVar.b);
    }

    public final void d(diu diuVar, Object obj) {
        this.b.put(diuVar, obj);
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof div) {
            return this.b.equals(((div) obj).b);
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
