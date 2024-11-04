package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jaz {
    public static final iqh e = new iqh();
    private final jaz a;
    public final ta c;
    public boolean d = false;

    public jaz(jaz jazVar, ta taVar) {
        if (jazVar != null) {
            hwx.J(jazVar.d);
        }
        this.a = jazVar;
        this.c = taVar;
    }

    public static jaz a(jaz jazVar, jaz jazVar2) {
        boolean z;
        if (jazVar.c()) {
            return jazVar2;
        }
        if (jazVar2.c()) {
            return jazVar;
        }
        jjr<jaz> o = jjr.o(jazVar, jazVar2);
        if (o.isEmpty()) {
            return jay.a;
        }
        if (o.size() == 1) {
            return (jaz) o.iterator().next();
        }
        int i = 0;
        for (jaz jazVar3 : o) {
            do {
                i += jazVar3.c.d;
                jazVar3 = jazVar3.a;
            } while (jazVar3 != null);
        }
        if (i == 0) {
            return jay.a;
        }
        ta taVar = new ta(i);
        for (jaz jazVar4 : o) {
            do {
                int i2 = 0;
                while (true) {
                    ta taVar2 = jazVar4.c;
                    if (i2 >= taVar2.d) {
                        break;
                    }
                    if (taVar.put((iqh) taVar2.c(i2), jazVar4.c.f(i2)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hwx.O(z, "Duplicate bindings: %s", jazVar4.c.c(i2));
                    i2++;
                }
                jazVar4 = jazVar4.a;
            } while (jazVar4 != null);
        }
        return new jay(null, taVar).b();
    }

    public final jaz b() {
        if (!this.d) {
            this.d = true;
            jaz jazVar = this.a;
            if (jazVar != null && this.c.isEmpty()) {
                return jazVar;
            }
            return this;
        }
        throw new IllegalStateException("Already frozen");
    }

    public final boolean c() {
        if (this == jay.a) {
            return true;
        }
        return false;
    }

    public final boolean d(iqh iqhVar) {
        if (this.c.containsKey(iqhVar)) {
            return true;
        }
        jaz jazVar = this.a;
        if (jazVar != null && jazVar.d(iqhVar)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (jaz jazVar = this; jazVar != null; jazVar = jazVar.a) {
            for (int i = 0; i < jazVar.c.d; i++) {
                sb.append(this.c.f(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
