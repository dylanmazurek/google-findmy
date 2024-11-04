package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fho extends Exception {
    private final rx a;

    public fho(rx rxVar) {
        this.a = rxVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (fik fikVar : this.a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.a.get(fikVar);
            fma.aR(connectionResult);
            z &= !connectionResult.b();
            arrayList.add(fikVar.a() + ": " + connectionResult.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
