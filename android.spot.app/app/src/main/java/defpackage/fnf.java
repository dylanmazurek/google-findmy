package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnf extends fni {
    final /* synthetic */ bym a;

    public fnf(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fni
    public final void c(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        if (status.a()) {
            try {
                byte[] bArr = getActivityControlsSettingsResult.a;
                lhl lhlVar = lhl.d;
                int length = bArr.length;
                lja ljaVar = lja.a;
                lkz lkzVar = lkz.a;
                ljn m = ljn.m(lhlVar, bArr, 0, length, lja.a);
                ljn.A(m);
                fma.ba(status, (lhl) m, this.a);
                return;
            } catch (ljy e) {
                this.a.r(e);
                return;
            }
        }
        fma.ba(status, null, this.a);
    }
}
