package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bug implements buf {
    private final Object[] a;
    private int b;

    public bug(int i) {
        this.a = new Object[i];
    }

    @Override // defpackage.buf
    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b = i2;
        return obj;
    }

    @Override // defpackage.buf
    public boolean b(Object obj) {
        obj.getClass();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i3 = this.b;
        Object[] objArr = this.a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.b = i3 + 1;
        return true;
    }
}
