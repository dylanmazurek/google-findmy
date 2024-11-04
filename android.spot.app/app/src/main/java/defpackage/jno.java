package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jno extends jpa {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(joa joaVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(joaVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.jpa
    public final int b() {
        return this.b;
    }

    @Override // defpackage.jpa
    public final joa c(int i) {
        if (i < this.b) {
            return (joa) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.jpa
    public final Object d(joa joaVar) {
        int a = a(joaVar);
        if (a != -1) {
            return joaVar.c(this.a[a + a + 1]);
        }
        return null;
    }

    @Override // defpackage.jpa
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(joa joaVar, Object obj) {
        int a;
        if (!joaVar.b && (a = a(joaVar)) != -1) {
            obj.getClass();
            this.a[a + a + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            this.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + i2;
        joaVar.getClass();
        objArr2[i3] = joaVar;
        obj.getClass();
        objArr2[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
