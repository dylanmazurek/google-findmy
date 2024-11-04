package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hlg(7);
    public final Bundle a;
    private Map b;

    public ksl(Bundle bundle) {
        this.a = bundle;
    }

    public static final int b(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    public final Map a() {
        if (this.b == null) {
            Bundle bundle = this.a;
            rx rxVar = new rx();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        rxVar.put(str, str2);
                    }
                }
            }
            this.b = rxVar;
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.O(parcel, 2, this.a);
        fma.F(parcel, D);
    }
}
