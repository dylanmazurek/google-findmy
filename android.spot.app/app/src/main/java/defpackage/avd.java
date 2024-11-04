package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class avd extends mpc implements mol {
    public static final avd a = new avd();

    public avd() {
        super(2, mpu.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
