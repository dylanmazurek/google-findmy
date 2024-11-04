package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxz extends fyh {
    final /* synthetic */ bym a;

    public fxz(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fyh
    public final void b(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        fma.ba(status, new lrs(new fyj(Status.b, usageReportingOptInOptions)), this.a);
    }
}
