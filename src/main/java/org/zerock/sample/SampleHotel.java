package org.zerock.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
public class SampleHotel {
	
	// 묵시적 생성자 주입
	private Chef chef;
}
