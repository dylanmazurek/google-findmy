package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vl implements vk {
    private final float a;
    private final float b;
    private final float c;
    private final vt d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vl() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl.<init>():void");
    }

    @Override // defpackage.uu
    public final /* bridge */ /* synthetic */ wq a(atk atkVar) {
        return qs.d(this);
    }

    @Override // defpackage.vk
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.vk
    public final float c(long j, float f, float f2, float f3) {
        vt vtVar = this.d;
        vtVar.a = f2;
        return Float.intBitsToFloat((int) (vtVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.vk
    public final float d(long j, float f, float f2, float f3) {
        vt vtVar = this.d;
        vtVar.a = f2;
        return Float.intBitsToFloat((int) (vtVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    @Override // defpackage.vk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(float r32, float r33, float r34) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl.e(float, float, float):long");
    }

    @Override // defpackage.vk
    public final /* synthetic */ wu f() {
        return new wu(this);
    }

    public vl(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        vt vtVar = new vt();
        if (f >= 0.0f) {
            vtVar.d = f;
            vtVar.c = false;
            if (vtVar.a() > 0.0f) {
                vtVar.b = Math.sqrt(f2);
                vtVar.c = false;
                this.d = vtVar;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public /* synthetic */ vl(float f, float f2, int i) {
        this(1 == (i & 1) ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, 0.01f);
    }
}
