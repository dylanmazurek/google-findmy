package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djl extends djb {
    public djl(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.dje
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.djb
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.djb
    protected final /* synthetic */ void e(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
