package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imm implements iml {
    long a = 0;

    @Override // defpackage.iml
    public final kwo a() {
        ljh k = kwo.c.k();
        long j = this.a;
        if (!k.b.y()) {
            k.t();
        }
        kwo kwoVar = (kwo) k.b;
        kwoVar.a = 1;
        kwoVar.b = Long.valueOf(j);
        return (kwo) k.q();
    }

    @Override // defpackage.iml
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof imm) && this.a == ((imm) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
