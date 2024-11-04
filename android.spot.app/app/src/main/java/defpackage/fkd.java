package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkd {
    public final DataHolder a;
    public int b;
    public int c;

    public fkd(DataHolder dataHolder, int i) {
        boolean z;
        int length;
        this.a = dataHolder;
        int i2 = 0;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        } else {
            z = false;
        }
        fma.aN(z);
        this.b = i;
        fma.aN(i >= 0 && i < dataHolder.h);
        while (true) {
            int[] iArr = dataHolder.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        this.c = i2 == length ? i2 - 1 : i2;
    }

    protected final String a(String str) {
        int i = this.b;
        int i2 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt(str));
    }

    public final String b() {
        return a("gaia_id");
    }

    public final String c() {
        return a("account_name");
    }

    public final String d() {
        return fwg.a.a(a("avatar"));
    }

    public final String e() {
        if (!TextUtils.isEmpty(a("display_name"))) {
            return a("display_name");
        }
        return c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fkd) {
            fkd fkdVar = (fkd) obj;
            if (amr.g(Integer.valueOf(fkdVar.b), Integer.valueOf(this.b)) && amr.g(Integer.valueOf(fkdVar.c), Integer.valueOf(this.c)) && fkdVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        if (h()) {
            return a("family_name");
        }
        return "null";
    }

    public final String g() {
        if (i()) {
            return a("given_name");
        }
        return "null";
    }

    public final boolean h() {
        if (!TextUtils.isEmpty(a("family_name"))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }

    public final boolean i() {
        if (!TextUtils.isEmpty(a("given_name"))) {
            return true;
        }
        return false;
    }
}
