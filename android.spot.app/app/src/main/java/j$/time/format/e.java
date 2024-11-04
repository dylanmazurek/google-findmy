package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements f {
    private final f[] a;
    private final boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ArrayList arrayList, boolean z) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z);
    }

    public final e a() {
        if (!this.b) {
            return this;
        }
        return new e(this.a, false);
    }

    @Override // j$.time.format.f
    public final boolean k(p pVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            pVar.g();
        }
        try {
            for (f fVar : this.a) {
                if (!fVar.k(pVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                pVar.a();
            }
            return true;
        } finally {
            if (z) {
                pVar.a();
            }
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.a;
        if (fVarArr != null) {
            boolean z = this.b;
            if (z) {
                str = "[";
            } else {
                str = "(";
            }
            sb.append(str);
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            if (z) {
                str2 = "]";
            } else {
                str2 = ")";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    e(f[] fVarArr, boolean z) {
        this.a = fVarArr;
        this.b = z;
    }
}
