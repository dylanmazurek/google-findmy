package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgm extends jme implements Serializable {
    private static final long serialVersionUID = 0;
    final jei a;
    final jme b;

    public jgm(jei jeiVar, jme jmeVar) {
        jeiVar.getClass();
        this.a = jeiVar;
        this.b = jmeVar;
    }

    @Override // defpackage.jme, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jei jeiVar = this.a;
        return this.b.compare(jeiVar.a(obj), jeiVar.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jgm) {
            jgm jgmVar = (jgm) obj;
            if (this.a.equals(jgmVar.a) && this.b.equals(jgmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        jei jeiVar = this.a;
        return this.b.toString() + ".onResultOf(" + jeiVar.toString() + ")";
    }
}
