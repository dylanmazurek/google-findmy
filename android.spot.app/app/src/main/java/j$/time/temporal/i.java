package j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
final class i implements o {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    private static final /* synthetic */ i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient s b;
    private final transient long c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        d = new i[]{iVar, iVar2, iVar3};
    }

    private i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = s.j((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) d.clone();
    }

    @Override // j$.time.temporal.o
    public final boolean B() {
        return true;
    }

    @Override // j$.time.temporal.o
    public final s k() {
        return this.b;
    }

    @Override // j$.time.temporal.o
    public final long n(l lVar) {
        return lVar.w(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.o
    public final boolean q(l lVar) {
        return lVar.g(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.o
    public final Temporal r(Temporal temporal, long j) {
        if (this.b.i(j)) {
            return temporal.d(j$.lang.a.h(j, this.c), a.EPOCH_DAY);
        }
        throw new RuntimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.o
    public final s w(l lVar) {
        if (lVar.g(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(this)));
    }
}
