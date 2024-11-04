package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ali {
    public int a;

    public ali() {
        this((char[]) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int hashCode = hashCode();
        moz.N(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        return sb.toString();
    }

    public ali(byte[] bArr) {
        this.a = 0;
    }

    public /* synthetic */ ali(char[] cArr) {
        this((byte[]) null);
    }
}
