package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djt extends djb {
    public djt(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.dje
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.djb
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.djb
    protected final /* synthetic */ void e(Object obj) {
        ((InputStream) obj).close();
    }
}
