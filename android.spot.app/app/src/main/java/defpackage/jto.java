package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jto {
    public final long a;
    public final jtp b;
    private final int c = 0;
    private final int d;

    public jto(long j, jtp jtpVar) {
        this.a = j;
        jtpVar.getClass();
        this.b = jtpVar;
        this.d = 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jto) {
            jto jtoVar = (jto) obj;
            if (this.a == jtoVar.a) {
                int i = jtoVar.d;
                int i2 = jtoVar.c;
                if (amr.g(null, null) && amr.g(this.b, jtoVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 2, null, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        jtp jtpVar = this.b;
        if (jtpVar != jtp.UNIT) {
            sb.append(jtpVar.name().toLowerCase());
        }
        sb.append("BYTE".toLowerCase());
        if (this.a != -1) {
            sb.append('s');
        }
        return sb.toString();
    }
}
