package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aem {
    public final List a;

    public aem() {
        this(null);
    }

    public final int a() {
        int intValue;
        if (this.a.size() <= 0) {
            abr.i("Set is empty");
        }
        int intValue2 = ((Number) this.a.get(0)).intValue();
        while (!this.a.isEmpty() && ((Number) this.a.get(0)).intValue() == intValue2) {
            List list = this.a;
            list.set(0, mkm.Z(list));
            this.a.remove(r2.size() - 1);
            List list2 = this.a;
            int size = list2.size();
            int size2 = list2.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int intValue3 = ((Number) this.a.get(i)).intValue();
                int i2 = i + 1;
                int i3 = i2 + i2;
                int i4 = i3 - 1;
                int intValue4 = ((Number) this.a.get(i4)).intValue();
                if (i3 < size && (intValue = ((Number) this.a.get(i3)).intValue()) > intValue4) {
                    if (intValue > intValue3) {
                        this.a.set(i, Integer.valueOf(intValue));
                        this.a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                } else if (intValue4 > intValue3) {
                    this.a.set(i, Integer.valueOf(intValue4));
                    this.a.set(i4, Integer.valueOf(intValue3));
                    i = i4;
                }
            }
        }
        return intValue2;
    }

    public final void b(int i) {
        if (!this.a.isEmpty()) {
            if (((Number) this.a.get(0)).intValue() != i) {
                if (((Number) this.a.get(r0.size() - 1)).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        List list = this.a;
        int size = list.size();
        list.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) this.a.get(i2)).intValue();
            if (i <= intValue) {
                break;
            }
            this.a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.a.set(size, Integer.valueOf(i));
    }

    public final boolean c() {
        if (!this.a.isEmpty()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ aem(byte[] bArr) {
        this.a = new ArrayList();
    }
}
