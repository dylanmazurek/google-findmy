package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqa implements dqb {
    private final /* synthetic */ int a;

    public dqa(int i) {
        this.a = i;
    }

    @Override // defpackage.dqb
    public final /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
            } else {
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                return;
            }
        }
        mediaExtractor.setDataSource(new dpz((ByteBuffer) obj));
    }

    @Override // defpackage.dqb
    public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
            } else {
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                return;
            }
        }
        mediaMetadataRetriever.setDataSource(new dpz((ByteBuffer) obj));
    }
}
