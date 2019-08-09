package org.zerock.sample;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel {
	
	// 묵시적 생성자 주입
	@NonNull
	private Chef chef;
}
