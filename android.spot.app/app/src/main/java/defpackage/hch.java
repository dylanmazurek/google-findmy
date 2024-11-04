package defpackage;

import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.UserHandle;
import com.google.android.apps.adm.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hch {
    public static final String a = "hch";

    private hch() {
    }

    public static hdy a(hcc hccVar, Context context) {
        Object systemService;
        List targetUserProfiles;
        Drawable profileSwitchingIconDrawable;
        CharSequence profileSwitchingLabel;
        if (Build.VERSION.SDK_INT >= 28 && hccVar.g.a) {
            systemService = context.getSystemService((Class<Object>) he$$ExternalSyntheticApiModelOutline0.m134m());
            CrossProfileApps m = he$$ExternalSyntheticApiModelOutline0.m(systemService);
            if (m != null) {
                targetUserProfiles = m.getTargetUserProfiles();
                if (!targetUserProfiles.isEmpty()) {
                    hri hriVar = hccVar.n;
                    UserHandle userHandle = (UserHandle) targetUserProfiles.get(0);
                    profileSwitchingIconDrawable = m.getProfileSwitchingIconDrawable(userHandle);
                    profileSwitchingLabel = m.getProfileSwitchingLabel(userHandle);
                    hdw a2 = hdy.a();
                    a2.e(R.id.og_ai_switch_profile);
                    a2.a = profileSwitchingIconDrawable;
                    a2.f(profileSwitchingLabel.toString());
                    a2.h(103027);
                    a2.g(new hhp(m, userHandle, hriVar, context, 1));
                    return a2.a();
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
