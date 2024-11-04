package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcc extends fbf {
    public int a;

    public fcc() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        this.a = leastSignificantBits;
    }

    @Override // defpackage.fbf
    public final /* bridge */ /* synthetic */ void c(fbf fbfVar) {
        fcc fccVar = (fcc) fbfVar;
        TextUtils.isEmpty(null);
        int i = this.a;
        if (i != 0) {
            fccVar.a = i;
        }
        TextUtils.isEmpty(null);
        if (!TextUtils.isEmpty(null)) {
            TextUtils.isEmpty(null);
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", null);
        hashMap.put("interstitial", false);
        hashMap.put("automatic", false);
        hashMap.put("screenId", Integer.valueOf(this.a));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", null);
        hashMap.put("referrerUri", null);
        return a(hashMap);
    }
}
