package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jeg extends jef implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class a;

    public jeg(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.jef
    protected final /* synthetic */ Object b(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        return Enum.valueOf(this.a, (String) obj);
    }

    @Override // defpackage.jei
    public final boolean equals(Object obj) {
        if (obj instanceof jeg) {
            return this.a.equals(((jeg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Enums.stringConverter(" + this.a.getName() + ".class)";
    }
}
