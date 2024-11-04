package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibi {
    public int a;
    public int b;
    public Boolean c;
    public byte d;
    private jer e;
    private int f;
    private long g;

    public ibi() {
        throw null;
    }

    public final ibj a() {
        Boolean bool;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.d == 15 && (bool = this.c) != null) {
            ibj ibjVar = new ibj(this.a, this.b, this.e, bool, this.f, this.g);
            if (ibjVar.a > 0) {
                z = true;
            } else {
                z = false;
            }
            hwx.J(z);
            if (ibjVar.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.J(z2);
            if (ibjVar.e > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            hwx.J(z3);
            if (ibjVar.f <= 0) {
                z4 = false;
            }
            hwx.J(z4);
            return ibjVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" connectTimeoutMillis");
        }
        if ((this.d & 2) == 0) {
            sb.append(" maxRetryCount");
        }
        if (this.c == null) {
            sb.append(" skipBluetoothAdapterEnabledCheck");
        }
        if ((this.d & 4) == 0) {
            sb.append(" requestConnectionPriorityRetryCount");
        }
        if ((this.d & 8) == 0) {
            sb.append(" requestConnectionPriorityRetryScheduleDelayMillis");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ihz ihzVar) {
        this.e = jer.i(ihzVar);
    }

    public final void c(int i) {
        this.f = i;
        this.d = (byte) (this.d | 4);
    }

    public final void d(long j) {
        this.g = j;
        this.d = (byte) (this.d | 8);
    }

    public ibi(ibj ibjVar) {
        this.e = jdl.a;
        this.a = ibjVar.a;
        this.b = ibjVar.b;
        this.e = ibjVar.c;
        this.c = ibjVar.d;
        this.f = ibjVar.e;
        this.g = ibjVar.f;
        this.d = (byte) 15;
    }

    public ibi(byte[] bArr) {
        this.e = jdl.a;
    }
}
