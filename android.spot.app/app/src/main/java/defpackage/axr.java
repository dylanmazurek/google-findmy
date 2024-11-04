package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axr implements apy {
    public static final axr a = new axr();
    public static Boolean b;

    private axr() {
    }

    @Override // defpackage.apy
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            bool.booleanValue();
            return false;
        }
        ll.h("canFocus is read before it is written");
        throw new mks();
    }

    @Override // defpackage.apy
    public final void b() {
        b = false;
    }
}
