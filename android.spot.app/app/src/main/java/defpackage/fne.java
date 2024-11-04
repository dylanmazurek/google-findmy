package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fne extends fni {
    final /* synthetic */ bym a;

    public fne(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fni
    public final void b(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        if (status.a()) {
            try {
                byte[] bArr = forceSettingsCacheRefreshResult.a;
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
