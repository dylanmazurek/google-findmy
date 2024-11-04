package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qj {
    public final int a;
    public final CharSequence b;

    public qj(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qj) {
            qj qjVar = (qj) obj;
            if (this.a == qjVar.a) {
                CharSequence charSequence = qjVar.b;
                String a = a(this.b);
                String a2 = a(charSequence);
                if (a != null || a2 != null) {
                    if (a != null && a.equals(a2)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a(this.b)});
    }
}
