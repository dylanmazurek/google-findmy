package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdl extends jer {
    public static final jdl a = new jdl();
    private static final long serialVersionUID = 0;

    private jdl() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.jer
    public final jer b(jei jeiVar) {
        return a;
    }

    @Override // defpackage.jer
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.jer
    public final Object d(jfe jfeVar) {
        Object a2 = jfeVar.a();
        a2.getClass();
        return a2;
    }

    @Override // defpackage.jer
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.jer
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jer
    public final Object f() {
        return null;
    }

    @Override // defpackage.jer
    public final boolean g() {
        return false;
    }

    @Override // defpackage.jer
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.jer
    public final jer a(jer jerVar) {
        return jerVar;
    }
}
