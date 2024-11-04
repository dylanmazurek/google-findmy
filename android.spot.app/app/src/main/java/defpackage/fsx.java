package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsx extends fss {
    final /* synthetic */ bym a;

    public fsx(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fss
    public final void c(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        fma.ba(status, openFileDescriptorResponse, this.a);
    }
}
