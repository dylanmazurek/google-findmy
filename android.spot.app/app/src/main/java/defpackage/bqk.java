package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqk {
    public static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z) {
        RemoteInput.Builder allowDataType;
        allowDataType = builder.setAllowDataType(str, z);
        return allowDataType;
    }

    static Map b(Intent intent, String str) {
        Map dataResultsFromIntent;
        dataResultsFromIntent = RemoteInput.getDataResultsFromIntent(intent, str);
        return dataResultsFromIntent;
    }

    static Set c(Object obj) {
        Set allowedDataTypes;
        allowedDataTypes = ((RemoteInput) obj).getAllowedDataTypes();
        return allowedDataTypes;
    }

    static void d(bqm bqmVar, Intent intent, Map map) {
        RemoteInput.addDataResultToIntent(bqj.h(bqmVar), intent, map);
    }

    public static final bur e(bum bumVar) {
        return bumVar.a();
    }
}
