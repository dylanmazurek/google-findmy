package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duy extends dgk {
    public static final /* synthetic */ int n = 0;
    private final Map o;

    public duy(String str, String str2, String str3, JSONObject jSONObject, dfv dfvVar, dfu dfuVar) {
        super(str, jSONObject.toString(), dfvVar, dfuVar);
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        if (str3.startsWith("oauth2:")) {
            hashMap.put("Authorization", "Bearer ".concat(str2));
        } else {
            hashMap.put("Authorization", "GoogleLogin auth=".concat(str2));
        }
    }

    @Override // defpackage.dfq
    public final Map d() {
        return this.o;
    }

    @Override // defpackage.dfq
    public final int k() {
        return 3;
    }
}
