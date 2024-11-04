package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ave extends mpc implements mol {
    public static final ave a = new ave();

    public ave() {
        super(2, mpu.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
