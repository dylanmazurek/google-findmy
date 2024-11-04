package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class npl implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected nno b() {
        throw null;
    }

    public abstract nnq c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().l(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npl)) {
            return false;
        }
        npl nplVar = (npl) obj;
        if (d() == nplVar.d() && g().equals(nplVar.g()) && moz.az(b(), nplVar.b())) {
            return true;
        }
        return false;
    }

    public final String f(Locale locale) {
        return c().o(a(), locale);
    }

    public final nns g() {
        return c().r();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        return "Property[" + c().q() + "]";
    }
}
