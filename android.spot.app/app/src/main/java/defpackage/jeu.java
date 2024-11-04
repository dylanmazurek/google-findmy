package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jeu extends jer {
    private static final long serialVersionUID = 0;
    public final Object a;

    public jeu(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.jer
    public final jer b(jei jeiVar) {
        Object a = jeiVar.a(this.a);
        a.getClass();
        return new jeu(a);
    }

    @Override // defpackage.jer
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.jer
    public final Object d(jfe jfeVar) {
        return this.a;
    }

    @Override // defpackage.jer
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.jer
    public final boolean equals(Object obj) {
        if (obj instanceof jeu) {
            return this.a.equals(((jeu) obj).a);
        }
        return false;
    }

    @Override // defpackage.jer
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.jer
    public final boolean g() {
        return true;
    }

    @Override // defpackage.jer
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }

    @Override // defpackage.jer
    public final jer a(jer jerVar) {
        return this;
    }
}
